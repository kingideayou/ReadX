package me.next.readx.openeye

import android.os.Bundle
import com.evernote.android.state.StateSaver
import me.next.readx.base.BasePresenter

/**
 * Created by NeXT on 17/6/1.
 */
class OpenEyePresenter : BasePresenter<Contract.View>(), Contract.Presenter {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        StateSaver.restoreInstanceState(this, savedInstanceState)
    }

    override fun onViewCreated(view: Contract.View?, savedInstanceState: Bundle?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        StateSaver.saveInstanceState(this, outState ?: return)
    }

}