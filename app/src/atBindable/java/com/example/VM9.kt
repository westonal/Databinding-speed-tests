package com.example

import android.databinding.BaseObservable
import android.databinding.Bindable
import example.com.databindingspeed.BR

class VM9 : BaseObservable() {

    @Bindable
    var a: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.a)
        }

    @Bindable
    var b: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.b)
        }

    @Bindable
    var c: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.c)
        }

    @Bindable
    var d: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.d)
        }

    @Bindable
    var e: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.e)
        }

    @Bindable
    var f: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.f)
        }

    @Bindable
    var g: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.g)
        }

    @Bindable
    var h: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.h)
        }

    @Bindable
    var i: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.i)
        }

    @Bindable
    var j: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.j)
        }
}