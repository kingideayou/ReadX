package me.next.readx.openeye

import android.os.Bundle
import android.util.Log
import com.evernote.android.state.StateSaver
import com.trello.rxlifecycle2.kotlin.bindToLifecycle
import io.reactivex.android.schedulers.AndroidSchedulers
import me.next.readx.base.BaseContentAdapter
import me.next.readx.base.BasePresenter
import me.next.readx.network.DataLayer
import me.next.readx.network.bean.OpenEyeData
import me.next.readx.network.services.OpenEyeService

/**
 * Created by NeXT on 17/6/1.
 */
class OpenEyePresenter : BasePresenter<Contract.View>(), Contract.Presenter {

    var adapter: BaseContentAdapter<OpenEyeData>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        StateSaver.restoreInstanceState(this, savedInstanceState)
    }

    override fun onViewCreated(view: Contract.View?, savedInstanceState: Bundle?) {
        DataLayer.init()
        OpenEyeService.getOpenEyeList()
                .map {
                    it.map { it.data }
                }
                .observeOn(AndroidSchedulers.mainThread())
                .bindToLifecycle(this)
                .subscribe({
                    adapter = BaseContentAdapter(it)
                    view?.setAdapter(adapter)
                    it.map {
                        Log.e("开眼列表", it.toString())
                    }
                }, this::onError)
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        StateSaver.saveInstanceState(this, outState ?: return)
    }

}