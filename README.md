此仓库包含了[图解Java多线程设计模式](https://www.amazon.com/%E5%9B%BE%E8%A7%A3Java%E5%A4%9A%E7%BA%BF%E7%A8%8B%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F-%E7%BB%93%E5%9F%8E%E6%B5%A9/dp/B01N7EVWOH) 的代码和笔记

# Intro 01. Java Thread
## 线程的启动
1. 继承Thread类 [PrintThread](./src/chapter_0_intro1_java_thread/demo02/PrintThread.java)
2. 实现runnable接口 [PrintRunnable](./src/chapter_0_intro1_java_thread/demo02/PrintRunnable.java)
3. ThreadFactory，将runnable传入newThread方法中 [PrintThreadFactory](./src/chapter_0_intro1_java_thread/demo02/PrintThreadFactory.java)
Thread类本身就是实现了Runnable接口，其run方法为空
## 线程的暂停
```java
Thread.sleep(1000);
```
## 线程的互斥
* synchronized方法
* synchronized代码块
  * vs synchronized实例方法：两者等效，也就是说`synchronized实例方法`是通过使用`this`锁来实现互斥的
    ```java
        synchronized void method1() {
        }
        void method1() {
            synchronized(this) {
            }
        }
    
    ```
  * vs synchronized静态方法：静态方法每次只能由一个线程运行，但是静态方法和实例方法使用的锁是不一样的，`synchronized静态方法`是通过使用`类对象`锁，即`SomeClass`类对应的`java.lang.class` 的实例，来实现互斥的
    ```java
        class SomeClass {
            synchronized static void method1() {
            }
            static void method1() {
                synchronized(SomeClass.class) {
                }
            }
        }
    
    ```
## 线程的协作
  * wait()方法
  * notify()方法
    * notify唤醒的线程不会立即开始运行，因为执行notify的线程还持有着锁
    ![img.png](./imgs/I1-17.png)
  * notifyAll()方法

该三个方法都是Object类的方法，与其说是对线程的操作不如说是针对实例的等待队列的操作

## 线程的状态迁移
Thread.Stat(Enum)，可以通过getState()方法获取
* NEW
* RUNNABLE
* TERMINATED 
* WAITING
* TIMED_WAITING
* BLOCKED

![img.png](./imgs/I1-22.png)

# Intro 02. 多线程程序的评价指标