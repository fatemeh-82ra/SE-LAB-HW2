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

<h3 dir='rtl'>اصل ۲: اصل باز-بسته (Open-Closed Principle)</h3>

<table dir='rtl'>
<thead>
<tr>
<th>موارد تحقق</th>
<th>موارد نقض</th>
</tr>
</thead>
<tbody>
<tr>
<td>
مدل‌ها این ویژگی را دارند، چرا که اگر قرار باشد مدل جدیدی برای ارسال پیام اضافه کنیم، مشابه ایمیل می‌توان متغیرهای خودش را تعریف کرد و متدهای getter و setter و خروجی‌ها و ورودی‌ها را هم نوشت؛ اما اگر مثلاً در خود فایل <code>Message</code> بخواهیم مدل جدیدی اضافه کنیم، بدون نیاز به تغییر فایل ایمیل و ... می‌توان این کار را انجام داد.  
<br><br>
اما نکته‌ی جزئی‌تر این است که فایل <code>Message</code> به قصد ارسال پیام علاوه بر متدهای پیام، ورودی و خروجی هم دارد، اما متأسفانه فرزندها جداگانه همه را تکرار کرده‌اند. این یعنی اگر قرار باشد یک تغییر، مانند تغییر در getter مربوط به مقصد پیام انجام شود، وقت زیادی برای تک‌تک فایل‌ها مثل ایمیل، SMS و ... صرف می‌شود، چون این‌ها به درستی در کلاس پدر قرار نگرفته‌اند.
</td>
<td>
در کلاس <code>Main</code> این اصل رعایت نشده، زیرا برای اضافه کردن سرویس جدید (مثل تلگرام) نیاز به تغییر مستقیم در کد وجود دارد (افزودن <code>case</code> در <code>switch</code> و شرط <code>if</code> جدید برای شناسایی کلاس جدید).  
<br><br>
یعنی برای گسترش عملکرد برنامه، باید فایل اصلی و موجود را تغییر دهیم که نقض مستقیم OCP است.
</td>
</tr>
</tbody>
</table>

<h3 dir='rtl'>اصل ۳: اصل جایگزینی لیسکوف (Liskov Substitution Principle)</h3>

<table dir='rtl'>
<thead>
<tr>
<th>موارد تحقق</th>
<th>موارد نقض</th>
</tr>
</thead>
<tbody>
<tr>
<td>
تمامی کلاس‌های پیاده‌سازی‌شده مثل <code>EmailMessageService</code>، <code>SmsMessageService</code> و <code>TelegramMessageService</code> از اینترفیس <code>MessageService</code> ارث‌بری کرده‌اند و بدون مشکل می‌توانند به جای یکدیگر استفاده شوند.  
<br><br>
متدهای تعریف‌شده در اینترفیس در همه‌ی کلاس‌ها به درستی پیاده‌سازی شده‌اند و رفتار برنامه را مختل نمی‌کنند.
</td>
<td>
مورد نقضی برای این اصل در کلاس‌های <code>services</code> و <code>Main</code> مشاهده نشده است.
</td>
</tr>
</tbody>
</table>

<h3 dir='rtl'>اصل ۴: اصل تفکیک واسط‌ها (Interface Segregation Principle)</h3>

<table dir='rtl'>
<thead>
<tr>
<th>موارد تحقق</th>
<th>موارد نقض</th>
</tr>
</thead>
<tbody>
<tr>
<td>
فعلاً به صورت ظاهری همه‌ی کلاس‌ها از یک اینترفیس ساده استفاده می‌کنند که فقط شامل متدهای اصلی است و بیش از حد بزرگ نشده.
</td>
<td>
در آینده، اگر بخواهیم متدهای متفاوت و خاص برای هر سرویس پیاده‌سازی کنیم (مثلاً ارسال عکس در تلگرام، یا تعیین زمان‌بندی در ایمیل)، اینترفیس <code>MessageService</code> مجبور خواهد شد متدهایی داشته باشد که فقط برای برخی سرویس‌ها مفید است.  
<br><br>
در این صورت کلاس‌های دیگر باید متدهایی را پیاده‌سازی کنند که واقعاً نیازی به آن ندارند. برای جلوگیری از این موضوع، بهتر است اینترفیس‌ها به صورت تفکیک‌شده طراحی شوند.
</td>
</tr>
</tbody>
</table>

<h3 dir='rtl'>اصل ۵: اصل وارونگی وابستگی (Dependency Inversion Principle)</h3>

<table dir='rtl'>
<thead>
<tr>
<th>موارد تحقق</th>
<th>موارد نقض</th>
</tr>
</thead>
<tbody>
<tr>
<td>
در لایه‌ی سرویس‌ها، کلاس‌ها به abstraction (<code>MessageService</code>) وابسته هستند و نه به همدیگر، که مطابق با DIP است.
</td>
<td>
در کلاس <code>Main</code> به صورت مستقیم از کلاس‌های <code>EmailMessageService</code>، <code>SmsMessageService</code> و <code>TelegramMessageService</code> استفاده شده است.  
<br><br>
این یعنی <code>Main</code> به implementation وابسته است، نه abstraction. اگر بخواهیم سرویس جدیدی اضافه کنیم، باید مستقیم به کد <code>Main</code> دست بزنیم که این اصل را نقض می‌کند.
</td>
</tr>
</tbody>
</table>

