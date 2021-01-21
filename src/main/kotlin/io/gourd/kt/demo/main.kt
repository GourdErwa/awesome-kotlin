package io.gourd.kt.demo

fun main() {
    println("Hello World!")
    "log demo...".log()
}


fun String.log() = logImpl(this)

private fun logImpl(message: String) {
    // no code
    println(message)
}

/*

编译后的字节码大体为

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        log("log demo...");
    }

    public static void log(String s) {
        logImpl(s);
    }

    private static void logImpl(String message) {
        System.out.println(message);
    }
}
 */

/*
kt 文件字节码编译：

javap -v -l -c MainKt.class

public final class io.gourd.kt.demo.MainKt
  minor version: 0
  major version: 55
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // io/gourd/kt/demo/MainKt
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 4, attributes: 2
Constant pool:
   #1 = Utf8               io/gourd/kt/demo/MainKt
   #2 = Class              #1             // io/gourd/kt/demo/MainKt
   #3 = Utf8               java/lang/Object
   #4 = Class              #3             // java/lang/Object
   #5 = Utf8               main
   #6 = Utf8               ()V
   #7 = Utf8               ([Ljava/lang/String;)V
   #8 = NameAndType        #5:#6          // main:()V
   #9 = Methodref          #2.#8          // io/gourd/kt/demo/MainKt.main:()V
  #10 = Utf8               Hello World!
  #11 = String             #10            // Hello World!
  #12 = Utf8               java/lang/System
  #13 = Class              #12            // java/lang/System
  #14 = Utf8               out
  #15 = Utf8               Ljava/io/PrintStream;
  #16 = NameAndType        #14:#15        // out:Ljava/io/PrintStream;
  #17 = Fieldref           #13.#16        // java/lang/System.out:Ljava/io/PrintStream;
  #18 = Utf8               java/io/PrintStream
  #19 = Class              #18            // java/io/PrintStream
  #20 = Utf8               println
  #21 = Utf8               (Ljava/lang/Object;)V
  #22 = NameAndType        #20:#21        // println:(Ljava/lang/Object;)V
  #23 = Methodref          #19.#22        // java/io/PrintStream.println:(Ljava/lang/Object;)V
  #24 = Utf8               log demo...
  #25 = String             #24            // log demo...
  #26 = Utf8               log
  #27 = Utf8               (Ljava/lang/String;)V
  #28 = NameAndType        #26:#27        // log:(Ljava/lang/String;)V
  #29 = Methodref          #2.#28         // io/gourd/kt/demo/MainKt.log:(Ljava/lang/String;)V
  #30 = Utf8               Lorg/jetbrains/annotations/NotNull;
  #31 = Utf8               $this$log
  #32 = String             #31            // $this$log
  #33 = Utf8               kotlin/jvm/internal/Intrinsics
  #34 = Class              #33            // kotlin/jvm/internal/Intrinsics
  #35 = Utf8               checkNotNullParameter
  #36 = Utf8               (Ljava/lang/Object;Ljava/lang/String;)V
  #37 = NameAndType        #35:#36        // checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
  #38 = Methodref          #34.#37        // kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
  #39 = Utf8               logImpl
  #40 = NameAndType        #39:#27        // logImpl:(Ljava/lang/String;)V
  #41 = Methodref          #2.#40         // io/gourd/kt/demo/MainKt.logImpl:(Ljava/lang/String;)V
  #42 = Utf8               Ljava/lang/String;
  #43 = Utf8               message
...
...
{
  public static final void main();
    descriptor: ()V
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=0
         0: ldc           #11                 // String Hello World!
         2: astore_0
         3: iconst_0
         4: istore_1
         5: getstatic     #17                 // Field java/lang/System.out:Ljava/io/PrintStream;
         8: aload_0
         9: invokevirtual #23                 // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
        12: ldc           #25                 // String log demo...
        14: invokestatic  #29                 // Method log:(Ljava/lang/String;)V
        17: return
      LineNumberTable:
        line 4: 0
        line 5: 12
        line 6: 17

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: (0x1009) ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=0, locals=1, args_size=1
         0: invokestatic  #9                  // Method main:()V
         3: return

  public static final void log(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: ldc           #32                 // String $this$log
         3: invokestatic  #38                 // Method kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
         6: aload_0
         7: invokestatic  #41                 // Method logImpl:(Ljava/lang/String;)V
        10: return
      LineNumberTable:
        line 9: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0 $this$log   Ljava/lang/String;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #30()
          org.jetbrains.annotations.NotNull
}

 */