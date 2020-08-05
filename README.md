# commonStatuBar 沉浸式状态栏
### 1、有问题请 提交 isuue/(QQ:194093798) 谢谢大家 持续更新

##集成
```
allprojects {
    repositories {
        jcenter()
    }
}
```
```
dependencies {
 implementation 'org.zhx.common:commonStatuBar:1.0.0'
 }
```
## 非Androidx 项目 ：
build.gradle 中：
```
	dependencies {
	     implementation 'org.zhx.common:commonStatuBar:1.0.0'
	}
```
并且 gradle.properties中 添加：
```
android.useAndroidX=true
android.enableJetifier=true
```

## 代码使用
 注:在 activity 的 onResume方法中 调用。
```
override fun onResume() {
        super.onResume()
        CommonStatusBar.acticity(this).whiteText().set()
    }
```

### 如果界面底部 有输入框  请多调用一句 bottomInput()
```
    @Override
    protected void onResume() {
        super.onResume();
        CommonStatusBar.acticity(this).blackText().bottomInput().set();
    }
```

