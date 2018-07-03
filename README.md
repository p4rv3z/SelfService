# SelfService
Android Library


How to
To get a Git project into your build:

Step 1. Add the JitPack repository to your build file
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  Step 2. Add the dependency
  dependencies {
	        implementation 'com.github.p4rv3z:SelfService:1.0'
	}
  
  
then synchronize your project.

Log print:
=========
#DEBUG log message
just print log with default tag: __PAR_LOG:::
_L.d("message");

print log with your tag
_L.d("TAG","message");

#VERBOSE log message
just print log with default tag: __PAR_LOG:::
_L.v("message");

print log with your tag
_L.v("TAG","message");

#INFO log message.
just print log with default tag: __PAR_LOG:::
_L.i("message");

print log with your tag
_L.i("TAG","message");

#WARN log message
just print log with default tag: __PAR_LOG:::
_L.w("message");

print log with your tag
_L.w("TAG","message");

#ERROR log message
just print log with default tag: __PAR_LOG:::
_L.e("message");

print log with your tag
_L.e("TAG","message");



Save and Load Data from SharedPreferences:
==========================================
To save integer data
_Data.saveInt("key", "value", context);
To load integer data
_Data.loadInt("key", context);


To save String data
_Data.saveString("key", "value", context);
To load String data
_Data.loadString("key", context);


To save Boolean data
_Data.saveBoolean("key", "value", context);
To load Boolean data
_Data.loadBoolean("key", context);


To save Float data
_Data.saveFloat("key", "value", context);
To load Float data
_Data.loadFloat("key", context);


To save Long data
_Data.saveLong("key", "value", context);
To load Long data
_Data.loadLong("key", context);



Dialog:
======
Show simple dialog with dismiss button
new _Dialog(context, "title", "message", "button text");


or,

new _Dialog(context).setTitle("title").setMessage("message").show();

uses:
setHeaderBackgroundColor(int backgroundColor) // set title background color
setBodyBackgroundColor(int backgroundColor)   // set message background color
setFooterBackgroundColor(int backgroundColor) // set footer background color
isCancelAble(boolean isCancelAble)            // true for cancel dialog on press back button
setGravity(int gravity)                       // set for dialog gravity
setIcon(Drawable icon)                        // set dialog icon
setPositiveButton(String positiveButton, final onClickListener onClickListener) // set positive button
setNegativeButton(String negativeButton, final onClickListener onClickListener) // set negative button
setNeutralButton(String neutralButton, final onClickListener onClickListener)   // set negative button
