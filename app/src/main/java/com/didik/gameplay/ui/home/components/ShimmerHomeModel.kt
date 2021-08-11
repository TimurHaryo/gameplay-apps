package com.didik.gameplay.ui.home.components

import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.didik.gameplay.R
import com.didik.gameplay.base.BaseHolder
import com.facebook.shimmer.ShimmerFrameLayout

@EpoxyModelClass
abstract class ShimmerHomeModel : EpoxyModelWithHolder<ShimmerHomeModel.Holder>() {

    override fun getDefaultLayout(): Int = R.layout.shimmer_game_section_home

    override fun bind(holder: Holder) {
        super.bind(holder)
        holder.containerShimmer.startShimmer()
    }

    override fun unbind(holder: Holder) {
        super.unbind(holder)
        holder.containerShimmer.stopShimmer()
    }

    class Holder : BaseHolder() {
        val containerShimmer by bind<ShimmerFrameLayout>(R.id.containerShimmer)
    }
}