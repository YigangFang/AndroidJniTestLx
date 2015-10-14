#include <jni.h>

JNIEXPORT jstring JNICALL Java_lx_com_androidjnitest2_ndk_NdkTest_ndkSayHello
        (JNIEnv *env, jobject j) {
    return (*env)->NewStringUTF(env, "Hello jni!");
};