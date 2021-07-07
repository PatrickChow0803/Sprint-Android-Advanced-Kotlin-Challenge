package com.patrickchow.advancedkotlinsprintchallenge.controller

import android.os.Bundle
import com.bluelinelabs.conductor.Controller

abstract class BaseControl : Controller{

    constructor()

    constructor(arg: Bundle): super(arg)

}