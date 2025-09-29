package com.gs.payment.plugin.receiver

import android.content.Context
import android.content.Intent
import android.util.Log

class FeedbackPayReceiver : BaseBroadReceiver() {

    companion object {
        private const val TAG = "PaymentPlugin.FeedbackPayReceiver"

        const val ACTION = "com.coffeeji.payment.plugin.MAKE_STATE_ACTION"
    }

    override fun onReceive(context: Context, intent: Intent) {
        super.onReceive(context, intent)
        Log.i(TAG, "Received intent action: ${intent.action}")
        log( "Received intent action: ${intent.action}")
        if (intent.action != ACTION) return

        val orderId = intent.getStringExtra("ORDER_ID")
        val orderMoney = intent.getStringExtra("ORDER_MONEY")
        val state = intent.getStringExtra("STATE")
        Log.i(TAG, "MAKE_STATE_ACTION received. ORDER_ID=${orderId}")
        Log.i(TAG, "MAKE_STATE_ACTION received. ORDER_MONEY=${orderMoney}")
        Log.i(TAG, "MAKE_STATE_ACTION received. STATE=${state}")

        log( "MAKE_STATE_ACTION received. ORDER_ID=${orderId}")
        log( "MAKE_STATE_ACTION received. ORDER_MONEY=${orderMoney}")
        log( "MAKE_STATE_ACTION received. STATE=${state}")
    }
}
