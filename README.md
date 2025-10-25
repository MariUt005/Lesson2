## ActivityLifecycle
Создан проект Lesson2, в нем создан модуль ActivityLifecycle.

![](attachment/f2010212eea053879685823399446b01.png)

![](attachment/0db9c2874edd69a138a41df2ef23a164.png)

Переопределены методы с добавлением логирования:

![](attachment/db64d4efffa5a577b6974d28ca9878b7.png)

![](attachment/9154886489676cb8bc59efecbae52214.png)

![](attachment/99acb59c574c9b024efadd9112915e92.png)

Создано текстовое поле для ввода "EditText"

![](attachment/286044ea27c2cc53f9ef911a9ef2ef8a.png)

Приложение запущено:

![](attachment/e987cb591f25bb03569bf64fabc9c96c.png)

Сообщения из окна LogCat:

![](attachment/b9c380e0201c399cae2899928af0faf6.png)

Введен текст в поле:

![](attachment/658937018643c588a2fd1bbaf177c936.png)

Вопросы:
1. Будет ли вызван метод "onCreate" после нажатия на кнопку "Home" и возврата в приложение?
	1. Нет, при нажатии "Home" активность переходит в фон (вызывается onPause, onStop), но не уничтожается. При возврате система вызывает onRestart, а затем onStart и onResume.
	2. ![](attachment/58a522cf25252e18b308a3f7857414c8.png)
2. Изменится ли значение поля "EditText" после нажатия на кнопку "Home" и возврата в приложение?
	1. Нет, не изменится. Система автоматически сохраняет состояние пользовательского интерфейса (включая текст в EditText), когда активность переходит в фон, и восстанавливает при возврате.
3. Изменится ли значение поля "EditText" после нажатия на кнопку "Back" и возврата в приложение?
	1. Нет, аналогично "Home".
	2. ![](attachment/76e4f8011a3b99acdd353b2897c074f9.png)

## MultiActivity
Создан модуль MultiActivity

![](attachment/4fd4daf50f7fb4c35c4f4123107e6057.png)

Создана кнопка: 

![](attachment/eab2c5e70df4a84d19000ae76aa04f1b.png)

Создание новой активности:

![](attachment/7ae90cbd5904b29117c10fc6b99356d9.png)

Создана новая активность:

![](attachment/6764e732fdadcd083dfc360d2489be93.png)

Добавлена кнопка:

![](attachment/9dbe9cba95687cae0d3006341eaf4b1e.png)

В activity_second.xml добавлен элемент TextView

![](attachment/f3e0b9e0aa7ace6bb99ea3e79d0aec1d.png)

Добавлено поле для ввода

![](attachment/359a781351180cb9327c6c7cd82b5910.png)

MainActivity.java

![](attachment/ffa8584d53bac6ea51f5536e45ad8eca.png)

![](attachment/f5f781548c4d3eda97ab16890f170929.png)

![](attachment/73f9665bc20fbed0ee702383f9e5aff8.png)

![](attachment/613533dfbac13970bf3cff570fab1ea7.png)

![](attachment/53cb3332b6a223a8012d87371558968c.png)

SecondActivity.java

![](attachment/0fbb30b511adb757fe3363807476afd3.png)

![](attachment/b715a6a818de9e6db08d654821e714b2.png)

![](attachment/6bc785ad702682ac527de32eae4c2cb8.png)

![](attachment/99f0eafde871118fef0c93b18d87fe50.png)

Введен текст:

![](attachment/d40e99dfc2ef3c153d09242e8bbe1a54.png)

После нажатия на кнопку:

![](attachment/69359b9f421472cde1e1a1947ac9caff.png)

Приложение отработало корректно.

Logcat:

![](attachment/94f13f5ab4a74dbd934552a5213c4e4e.png)

![](attachment/6fafa13c49afebaf0c54bae77dff833e.png)

![](attachment/8972afc8e33ae8da18016e82e99ae956.png)

## IntentFilter

Создание модуля «IntentFilter»

![](attachment/f414310f7f830e5d73b42961e34679fd.png)

MainActivity.java

![](attachment/a28d15a3422bdfc19291f73cd893fd11.png)

activity_main.xml

![](attachment/4e8bb072defabe9b516c7eb3df26d5b0.png)

Программа после запуска:

![](attachment/47369c4c6d7267394eb555101449f956.png)

При нажатии на кнопку "Интернет"

![](attachment/606d55bcf54c8f53ebd74b57ecc88214.png)

При нажатии на кнопку "Текст"

![](attachment/8879f45fa1a405b2da7ef7bd05ad1a59.png)

## ToastApp

Создание модуля «ToastApp»

![](attachment/2378c90be61b6be85bf2b61433f6d615.png)

activity_main.xml

![](attachment/115f11ffe7e12ec2041a44a8b58bf0d4.png)

MainActivity.java

![](attachment/8bb29b0540d2e40454fbfa45ad1ca47f.png)

Приложение:

![](attachment/61ce35a1d25a951dd6200a39443d2b21.png)

## NotificationApp

Создание модуля NotificationApp:

![](attachment/823b47bf2b19a0ea066cff5b8d620a12.png)

Создана кнопка:

![](attachment/43559bb7491e6c065f1a2cd0e6f6b18c.png)

Добавлена информация о требуемых разрешениях:

![](attachment/a0297e195ff5eb2eeb8d42659f356e88.png)

MainActivity.java:

![](attachment/037eee75b0e9ddd66ff73f8fe942ecb1.png)

![](attachment/23c3dd0fa385a92a03ca9edb6b1136e8.png)

Запрашивается разрешение на отправку уведомлений:

![](attachment/73b902c7e41c1b35f3708de8136ed355.png)

При нажатии на кнопку появляется уведомление:

![](attachment/80e9e3aaf294cd82b40f6d64d3f8ccfc.png)

Создание модуля Dialog

![](attachment/c0680e5a9d5e05c7b028c61661348799.png)Создана кнопка:

![](attachment/ba91ae98a73a7b9dc47b6c870fa53669.png)

MainActivity.java

![](attachment/ca8d64981fbca68965d2338cf2d8f0fc.png)

При нажатии на кнопку темнеет окно:

![](attachment/82146bdeb374a2a5e0a16b91c17ecbfd.png)

Создание диалогового окна с тремя кнопками:

![](attachment/b44674ed634ae0f68c67fdef6c33f7fa.png)

Добавлено закрытие диалога при нажатии на кнопку:

![](attachment/faccf9760c2e96274c697c532a0b8b66.png)

При нажатии на кнопку появляется диалог:

![](attachment/7783ea757c7c3739227d5b77b9f5eedc.png)

При выборе одного из вариантов появляется сообщение с соответствующим текстом:![](attachment/2e333110ca7ffacfe22b0c3806e77368.png)

## Самостоятельная работа

Создание модуля для самостоятельной работы:

![](attachment/1bfaaa08e74d0b8ab8f89d2bac34b3f4.png)

Интерфейс программы:

![](attachment/41aa7b1eb048fbb5d047456d88841ab2.png)MainActivity.java:

MainActivity.java
```
package ru.mirea.utenkovama.samrab;  
  
import android.os.Bundle;  
import java.util.Calendar;  
import android.widget.TextView;  
import android.app.ProgressDialog;  
import android.app.TimePickerDialog;  
import android.os.Handler;  
import android.view.View;  
import androidx.activity.EdgeToEdge;  
import androidx.appcompat.app.AppCompatActivity;  
import androidx.core.graphics.Insets;  
import androidx.core.view.ViewCompat;  
import androidx.core.view.WindowInsetsCompat;  
import android.os.Message;  
import android.app.DatePickerDialog;  
import android.widget.TimePicker;  
import android.widget.DatePicker;  
import android.text.format.DateUtils;  
  
public class MainActivity extends AppCompatActivity {  
    Calendar dateAndTime = Calendar.getInstance();  
    TextView currentDateTime;  
    ProgressDialog progressDialog;  
    Handler handler;  
  
    @Override  
    protected void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        EdgeToEdge.enable(this);  
        setContentView(R.layout.activity_main);  
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {  
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());  
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);  
            return insets;  
        });  
    }  
  
    public void onClickShowDialog(View view) {  
        progressDialog = new ProgressDialog(this);  
        progressDialog.setMax(100);  
        progressDialog.setMessage("Идет загрузка...");  
        progressDialog.setTitle("Пример работы ProgressDialog");  
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);  
        progressDialog.show();  
  
        handler = new Handler() {  
            public void handleMessage(Message msg) {  
                if (progressDialog.getProgress() < progressDialog.getMax()) {  
                    progressDialog.incrementProgressBy(20);  
                    handler.sendEmptyMessageDelayed(0, 500);  
                } else {  
                    // когда шкала заполнилась, диалог пропадает  
                    progressDialog.dismiss();  
                }  
            }  
        };  
        handler.sendEmptyMessageDelayed(0, 1000);  
  
    }  
    public void setDate(View v) {  
        new DatePickerDialog(MainActivity.this, d,  
                dateAndTime.get(Calendar.YEAR),  
                dateAndTime.get(Calendar.MONTH),  
                dateAndTime.get(Calendar.DAY_OF_MONTH))  
                .show();  
    }  
  
  
    public void setTime(View v) {  
        new TimePickerDialog(MainActivity.this, t,  
                dateAndTime.get(Calendar.HOUR_OF_DAY),  
                dateAndTime.get(Calendar.MINUTE), true)  
                .show();  
    }  
  
    TimePickerDialog.OnTimeSetListener t=new TimePickerDialog.OnTimeSetListener() {  
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {  
            dateAndTime.set(Calendar.HOUR_OF_DAY, hourOfDay);  
            dateAndTime.set(Calendar.MINUTE, minute);  
            setInitialDateTime();  
        }  
    };  
    DatePickerDialog.OnDateSetListener d=new DatePickerDialog.OnDateSetListener() {  
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {  
            dateAndTime.set(Calendar.YEAR, year);  
            dateAndTime.set(Calendar.MONTH, monthOfYear);  
            dateAndTime.set(Calendar.DAY_OF_MONTH, dayOfMonth);  
            setInitialDateTime();  
        }  
    };  
    private void setInitialDateTime() {  
  
        currentDateTime.setText(DateUtils.formatDateTime(this,  
                dateAndTime.getTimeInMillis(),  
                DateUtils.FORMAT_SHOW_DATE | DateUtils.FORMAT_SHOW_YEAR  
                        | DateUtils.FORMAT_SHOW_TIME));  
    }  
  
}
```

Прогресс-диалог:

![](attachment/0cf9bf93fb2e669f7a81cd63fc1586ed.png)

Выбор времени:

![](attachment/e1372ae26e1439344229571607a9be6a.png)

Время установлено:

![](attachment/219c60a3f8478fd12bfac98283088ea0.png)

Выбор даты:

![](attachment/04da375c23a2bcc9caf3434876f05fba.png)

Дата изменена:

![](attachment/d4748ba3d9dec347bfe7158fd5ee923b.png)
