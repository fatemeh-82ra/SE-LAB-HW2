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
