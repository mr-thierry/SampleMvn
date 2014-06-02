package com.example.samplelib1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class FontTextView extends TextView   {

	public FontTextView(final Context context) {
		super(context);

		init(context, null);
	}

	public FontTextView(final Context context, final AttributeSet attrs) {
		super(context, attrs);

		init(context, attrs);
	}

	public FontTextView(final Context context, final AttributeSet attrs, final int defStyle) {
		super(context, attrs, defStyle);

		init(context, attrs);
	}

	private void init(Context context, AttributeSet attrs) {
		if (attrs != null) {
			final TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.FontTextView);
			final String customFont = a.getString(R.styleable.FontTextView_fontName);

			Typeface font = Typeface.createFromAsset(context.getAssets(), "fonts/" + customFont + ".otf");
			
			if (font == null) {
				throw new RuntimeException("Font not found!");
			}

			setTypeface(font);

			a.recycle();
		}

	}
}
