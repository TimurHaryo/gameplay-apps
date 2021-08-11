package com.didik.gameplay.ui.home.components

import androidx.appcompat.widget.AppCompatImageButton
import androidx.appcompat.widget.AppCompatTextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.isVisible
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.didik.gameplay.R
import com.didik.gameplay.base.BaseHolder

@EpoxyModelClass
abstract class HeaderModel : EpoxyModelWithHolder<HeaderModel.Holder>() {

    @EpoxyAttribute
    var title: String? = null

    @EpoxyAttribute
    var subtitle: String? = null

    @EpoxyAttribute
    var onSeeMoreClickListener: (() -> Unit)? = null

    override fun getDefaultLayout(): Int = R.layout.component_header

    override fun bind(holder: Holder) {
        with(holder) {
            titleTextView.run {
                text = title
                isVisible = title.isNullOrBlank().not()
            }

            subtitleTextView.run {
                text = subtitle
                isVisible = subtitle.isNullOrBlank().not()
            }

            seeMoreButton.run {
                isVisible = (onSeeMoreClickListener != null)
                setOnClickListener {
                    onSeeMoreClickListener?.invoke()
                }
            }
        }
    }

    inner class Holder : BaseHolder() {
        val containerView by bind<ConstraintLayout>(R.id.headerView)
        val titleTextView by bind<AppCompatTextView>(R.id.titleTextView)
        val subtitleTextView by bind<AppCompatTextView>(R.id.subtitleTextView)
        val seeMoreButton by bind<AppCompatImageButton>(R.id.seeAllButton)
    }
}