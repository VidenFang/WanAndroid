package com.btpj.wanandroid.ui.main.project

import com.btpj.lib_base.base.BaseVMBFragment
import com.btpj.wanandroid.R
import com.btpj.wanandroid.databinding.HomeFragmentBinding

/**
 * 我的
 *
 * @author LTP 2022/3/10
 */
class ProjectFragment :
    BaseVMBFragment<ProjectViewModel, HomeFragmentBinding>(R.layout.project_fragment) {

    companion object {
        fun newInstance() = ProjectFragment()
    }

    override fun initView() {

    }
}