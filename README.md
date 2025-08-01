<table dir='rtl'>
<tbody>
<tr>
<td width="64">
<p><strong>ردیف</strong></p>
</td>
<td width="198">
<p><strong>محل اعمال تغییرات (کلاس/واسط)</strong></p>
</td>
<td width="141">
<p><strong>عنوان تغییر</strong></p>
</td>
<td width="292">
<p><strong>شرحی کوتاه از تغییر</strong></p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۱</strong></p>
</td>
<td width="198">
<p><code>services/MessageService</code></p>
</td>
<td width="141">
<p>افزودن تابع ارسال پیام تلگرامی</p>
</td>
<td width="292">
<p>افزودن یک متد <code>void</code> با عنوان <code>sendTelegramMessage</code> به اینترفیس.</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۲</strong></p>
</td>
<td width="198">
<p><code>models/TelegramMessage</code></p>
</td>
<td width="141">
<p>افزودن کلاس TelegramMessage</p>
</td>
<td width="292">
<p>افزودن کلاس <code>TelegramMessage</code> که از کلاس <code>Message</code> ارث‌بری می‌کند.</p>
<p>این کلاس مدل مربوط به پیام‌رسان تلگرام است که برای <code>get</code>code> و <code>set</code>code> کردن id مربوط به مبدا و مقصد است.</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۳</strong></p>
</td>
<td width="198">
<p><code>services/TelegramMessageService</code></p>
</td>
<td width="141">
<p>افزودن کلاس سرویس پیام تلگرامی</p>
</td>
<td width="292">
<p>افزودن کلاس <code>TelegramMessageService</code> که اینترفیس <code>MessageService</code> را پیاده‌سازی می‌کند.</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۴</strong></p>
</td>
<td width="198">
<p><code>services/TelegramMessageService</code></p>
</td>
<td width="141">
<p>افزودن تابع صحت‌سنجی ID تلگرام</p>
</td>
<td width="292">
<p>افزودن یک متد <code>private boolean</code> با عنوان <code>validateId</code> برای بررسی صحت ID.</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۵</strong></p>
</td>
<td width="198">
<p><code>services/TelegramMessageService</code></p>
</td>
<td width="141">
<p>افزودن تابع ارسال پیام تلگرامی</p>
</td>
<td width="292">
<p>پیاده‌سازی متد <code>void</code> با عنوان <code>sendTelegramMessage</code> برای ارسال پیام.</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۶</strong></p>
</td>
<td width="198">
<p><code>services/SmsMessageService</code></p>
</td>
<td width="141">
<p>افزودن تابع ارسال پیام تلگرامی</p>
</td>
<td width="292">
<p>افزودن یک متد <code>void</code> با عنوان <code>sendTelegramMessage</code> که بدنه‌ی آن خالی است.</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۷</strong></p>
</td>
<td width="198">
<p><code>services/EmailMessageService</code></p>
</td>
<td width="141">
<p>افزودن تابع ارسال پیام تلگرامی</p>
</td>
<td width="292">
<p>افزودن یک متد <code>void</code> با عنوان <code>sendTelegramMessage</code> که بدنه‌ی آن خالی است.</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۸</strong></p>
</td>
<td width="198">
<p><code>Main</code></p>
</td>
<td width="141">
<p>افزودن گزینه تلگرام به منو</p>
</td>
<td width="292">
<p>افزودن یک <code>println</code> برای نمایش گزینه ارسال پیام تلگرامی به کاربر.</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۹</strong></p>
</td>
<td width="198">
<p><code>Main</code></p>
</td>
<td width="141">
<p>افزودن منطق ساخت پیام تلگرام</p>
</td>
<td width="292">
<p>اضافه کردن <code>case 3:</code> به بدنه‌ی <code>switch</code> برای دریافت اطلاعات و ساخت شیء <code>TelegramMessage</code>.</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۱۰</strong></p>
</td>
<td width="198">
<p><code>Main</code></p>
</td>
<td width="141">
<p>افزودن منطق ارسال پیام تلگرام</p>
</td>
<td width="292">
<p>اضافه کردن بلوک <code>else if (message instanceof TelegramMessage)</code> برای فراخوانی سرویس تلگرام.</p>
</td>
</tr>
</tbody>
</table>
<div dir='rtl'>
<p>تعداد کل فایل‌های تغییر یافته یا اضافه شده: ۶</p>
<p>تعداد کل تغییرات متمایز اعمال شده: ۱۰</p>
</div>


<h2 dir='rtl'>مرحله سوم: بررسی اصول SOLID (به جز SRP)</h2>

<table dir='rtl' border="1" cellspacing="0" cellpadding="6">
  <thead>
    <tr>
      <th width="100"><strong>اصل</strong></th>
      <th width="150"><strong>نام اصل</strong></th>
      <th width="150"><strong>موارد تحقق</strong></th>
      <th width="400"><strong>موارد نقض</strong></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong>1</strong></td>
      <td><strong>Single Responsibility</strong></td>
      <td>
        برای هر کدام از مدل‌ها این مورد رعایت شده، هر کدام از مدل‌ها تعدادی متغیر تعریف کرده و توابع setter و getter برای خود تعریف کرده‌اند که نشان می‌دهد که وظیفه‌ی پاسخ‌گویی به همان متغیرهای خود را به‌عهده دارند.
      </td>
      <td>
        برای سرویس‌ها این نکته رعایت نشده. چرا که اولاً هر کلاسی دارد دو تا سرویس مجزا (validation و send) را انجام می‌دهد و لذا دو دلیل مختلف برای تغییر این فایل‌ها وجود دارد. در ضمن، طراحی بد کد (وجود سه تابع در رابطه) باعث شده که حتماً هر کلاسی حتی بد‌ پیاده‌سازی، تابعی که خودش پیاده‌سازی نمی‌کند، آن تابع را خالی بگذارد. گویا هر کلاسی اینجا مسئول است که حتماً پیاده‌سازی‌ای درباره سایرین هم داشته باشد.
      </td>
    </tr>
    <tr>
      <td><strong>2</strong></td>
      <td><strong>Open-Close Principle (OCP)</strong></td>
      <td>
        مدل‌ها این ویژگی را دارند، چرا که اگر قرار باشد مدل جدیدی برای <code>extend</code> کردن اضافه کنیم، مشابه ایمیل می‌توان متغیرهای خودش را تعریف کرد و <code>getter</code> و <code>setter</code> و خروجی‌ها را هم نوشت؛ یا اگر مثلاً در خود فایل <code>Message</code> مورد جدیدی اضافه کنیم، بدون نیاز به تغییر فایل ایمیل و ... می‌توان این کار را انجام داد.  
        اما نکته کلیدی‌تر این است که فایل <code>Message</code> به‌قصد ارسال پیام، علاوه بر متدهای پیام، ورودی و خروجی هم دارد اما متأسفانه هر فرزندی جداگانه همه را تکرار کرده. این یعنی اگر قرار باشد یک تغییری، مانند تغییر در <code>getter</code> مربوط به ورودی پیام انجام شود، وقت باید برای تک‌تک فایل‌ها مثل ایمیل، sms، ... اعمال گردد چون که این‌ها به درستی در کلاس پدر گذاشته نشده بودند.
      </td>
      <td>
        در کلاس <code>Main</code> این اصل رعایت نشده، چرا که برای اضافه کردن سرویس جدید مانند تلگرام، نیاز به افزودن شرط <code>if</code> یا <code>switch case</code> و تغییر مستقیم در کلاس است. یعنی فایل موجود باید ویرایش شود و نه فقط توسعه داده شود. این موضوع دقیقاً نقض اصل Open-Closed است.
      </td>
    </tr>
    <tr>
      <td><strong>3</strong></td>
      <td><strong>Liskov Substitution Principle (LSP)</strong></td>
      <td>
        همه‌ی کلاس‌های پیاده‌سازی‌شده از واسط <code>MessageService</code> ارث‌بری کرده‌اند و متدهای آن را بدون خطا و به شکل کامل پیاده‌سازی کرده‌اند، بنابراین می‌توان بدون تغییر در کد، هرکدام را جایگزین دیگری کرد.
      </td>
      <td>
        موردی از نقض این اصل مشاهده نشد.
      </td>
    </tr>
    <tr>
      <td><strong>4</strong></td>
      <td><strong>Interface Segregation Principle (ISP)</strong></td>
      <td>
        در حال حاضر اینترفیس <code>MessageService</code> فقط متدهای اصلی و مشترک را در خود دارد و بیش از حد بزرگ نشده است.
      </td>
      <td>
        اگر در آینده متدهای خاص برای هر سرویس اضافه شود (مثل زمان‌بندی در ایمیل یا ارسال فایل در تلگرام)، اینترفیس به‌ناچار باید متدهایی را داشته باشد که برای برخی کلاس‌ها بی‌معنی است. این موضوع با اصل تفکیک واسط در تضاد است.
      </td>
    </tr>
    <tr>
      <td><strong>5</strong></td>
      <td><strong>Dependency Inversion Principle (DIP)</strong></td>
      <td>
        در لایه‌ی سرویس‌ها، کلاس‌ها از abstraction یعنی واسط <code>MessageService</code> استفاده کرده‌اند که با این اصل سازگار است.
      </td>
      <td>
        کلاس <code>Main</code> به جای اینکه به abstraction وابسته باشد، مستقیماً به کلاس‌های پیاده‌سازی‌شده مثل <code>EmailMessageService</code> و <code>TelegramMessageService</code> وابسته است. بنابراین با اضافه شدن هر سرویس جدید، باید در <code>Main</code> تغییر ایجاد شود که نقض این اصل است.
      </td>
    </tr>
  </tbody>
</table>
