package com.btpj.wanandroid.ui.integral.record

import androidx.lifecycle.MutableLiveData
import com.btpj.lib_base.base.BaseViewModel
import com.btpj.lib_base.bean.PageResponse
import com.btpj.lib_base.ext.handleResponse
import com.btpj.lib_base.ext.request
import com.btpj.wanandroid.data.DataRepository
import com.btpj.wanandroid.data.bean.IntegralRecord

class IntegralRecordViewModel : BaseViewModel() {
    val integralRecordPageList = MutableLiveData<PageResponse<IntegralRecord>>()

    override fun start() {}

    /**
     * 获取积分记录分页列表
     *
     * @param pageNo 页码
     */
    fun fetchIntegralRecordPageList(pageNo: Int = 1) {
        request({
            val response = DataRepository.getIntegralRecordPageList(pageNo)
            handleResponse(response, {
                integralRecordPageList.value = response.data!!
            })
        })
    }
}