package me.next.readx.network.bean

import paperparcel.PaperParcel
import paperparcel.PaperParcelable

/**
 * Created by NeXT on 17/5/27.
 */

data class OpenEyeDataResponse(
        val issueList: ArrayList<OpenEyeDataIssue>
)

data class OpenEyeDataIssue(
        val itemList: ArrayList<OpenEyeDataItem>
)

data class OpenEyeDataItem(
        val data: OpenEyeDataItem
)

@PaperParcel data class OpenEyeData(
        val id: String,
        val title: String,
        val description: String,
        val coverForFeed: String,
        val playUrl: String): PaperParcelable {

    @Transient val somethingToExclude = 10000L

    companion object {
        @JvmField val CREATOR = PaperParcelOpenEyeData.CREATOR
    }

}