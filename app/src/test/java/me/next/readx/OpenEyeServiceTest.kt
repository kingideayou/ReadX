package me.next.readx

import me.next.readx.network.DataLayer
import me.next.readx.network.services.OpenEyeService
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

/**
 * Created by NeXT on 17/5/27.
 */
@RunWith(RobolectricTestRunner::class)
@Config(constants = BuildConfig::class)
class OpenEyeServiceTest {

    @Before
    fun setUp() {
        DataLayer.init()
    }

    @Test
    fun testGetOpenEye() {
        val openEyeList = OpenEyeService.getOpenEyeList().blockingFirst()
        print(openEyeList)
        print(openEyeList.size)
        Assert.assertTrue(openEyeList.isNotEmpty())
    }
}