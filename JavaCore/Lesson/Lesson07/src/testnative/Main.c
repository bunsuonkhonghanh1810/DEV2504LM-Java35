#include <jni.h>
#include "testnative_Main.h"

JNIEXPORT jint JNICALL Java_testnative_Main_square(JNIEnv *env, jobject obj, jint i) {
    return i * i;
}