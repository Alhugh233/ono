package moe.ono.util

import android.os.Bundle

fun Bundle?.toMap(): Map<String, Any?>{
    if (this == null) return mapOf()
    val res = HashMap<String, Any?>()
    for (key in this.keySet()) {
        res[key] = this.get(key)
    }
    return res
}