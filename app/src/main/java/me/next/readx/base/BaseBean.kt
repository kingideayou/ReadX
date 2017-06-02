package me.next.readx.base

import me.next.readx.base.type.TypeFactory

/**
 * Created by NeXT on 17/6/2.
 */
interface BaseBean {
    fun type(typeFactory: TypeFactory): Int
}