package com.example.opengl20demo

import android.opengl.GLES20
import android.opengl.GLSurfaceView
import javax.microedition.khronos.egl.EGLConfig
import javax.microedition.khronos.opengles.GL10


/**
 * Created by zhanglulu on 2020/6/16.
 * for
 */
class MyGLRenderer : GLSurfaceView.Renderer {
    private lateinit var mTriangle: Triangle
    private lateinit var mSquare: Square

    /**
     * 系统会在创建 GLSurfaceView 时调用一次此方法。
     * 使用此方法可执行仅需发生一次的操作，例如设置 OpenGL 环境参数或初始化 OpenGL 图形对象。
     */
    override fun onSurfaceCreated(gl: GL10?, config: EGLConfig?) {
        // Set the background frame color
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f)

        // initialize a triangle
        mTriangle = Triangle()
        // initialize a square
        mSquare = Square()
    }


    /**
     * 系统会在每次重新绘制 GLSurfaceView 时调用此方法。请将此方法作为绘制（和重新绘制）图形对象的主要执行点。
     */
    override fun onDrawFrame(gl: GL10?) {
        // Redraw background color
        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT)
        mTriangle.draw()
    }

    /**
     * 系统会在 GLSurfaceView 几何图形发生变化（包括 GLSurfaceView 大小发生变化或设备屏幕方向发生变化）
     * 时调用此方法。例如，系统会在设备屏幕方向由纵向变为横向时调用此方法。
     * 使用此方法可响应 GLSurfaceView 容器中的更改。
     */
    override fun onSurfaceChanged(gl: GL10?, width: Int, height: Int) {
        GLES20.glViewport(0, 0, width, height)
    }




}