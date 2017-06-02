package me.next.readx.network.bean

import me.next.readx.base.BaseBean
import me.next.readx.base.type.TypeFactory
import paperparcel.PaperParcel
import paperparcel.PaperParcelable

/**
 * Created by NeXT on 17/5/27.
 */

data class OpenEyeDataIssue(
        val itemList: ArrayList<OpenEyeDataItem>
)

data class OpenEyeDataItem(
        val data: OpenEyeData
)

@PaperParcel data class OpenEyeData(
        val id: String,
        val title: String,
        val description: String,
        val coverForFeed: String,
        val playUrl: String): PaperParcelable, BaseBean {

    @Transient val somethingToExclude = 10000L

    companion object {
        @JvmField val CREATOR = PaperParcelOpenEyeData.CREATOR
    }

    override fun type(typeFactory: TypeFactory): Int {
        return typeFactory.type(this)
    }

}