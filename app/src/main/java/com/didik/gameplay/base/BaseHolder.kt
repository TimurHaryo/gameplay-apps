package com.didik.gameplay.base

import android.view.View
import com.airbnb.epoxy.EpoxyHolder
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

abstract class BaseHolder : EpoxyHolder() {

    private lateinit var view: View

    override fun bindView(itemView: View) {
        view = itemView
    }

    protected fun <V : View> bind(viewId: Int): ReadOnlyProperty<BaseHolder, V> {
        return Lazy { holder: BaseHolder, property ->
            holder.view.findViewById(viewId) as V?
                ?: throw IllegalStateException("View ID $viewId for '${property.name}' not found.")
        }
    }

    private class Lazy<V>(
        private val initializer: (BaseHolder, KProperty<*>) -> V
    ) : ReadOnlyProperty<BaseHolder, V> {

        private object EMPTY

        private var value: Any? = EMPTY

        @Suppress("UNCHECKED_CAST")
        override fun getValue(
            thisRef: BaseHolder,
            property: KProperty<*>
        ): V {
            if (value == EMPTY) {
                value = initializer(thisRef, property)
            }
            return value as V
        }
    }
}