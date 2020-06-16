package com.example.opengl20demo

import android.content.Context
import android.opengl.GLSurfaceView

/**
 * Created by zhanglulu on 2020/6/16.
 * for
 */
class MyGLSurfaceView(context: Context?) : GLSurfaceView(context) {
    private val renderer = MyGLRenderer()
    init {
        // Create an OpenGL ES 2.0 context
        setEGLContextClientVersion(2)
        // Set the Renderer for drawing on the GLSurfaceView
        setRenderer(renderer)
    }
}