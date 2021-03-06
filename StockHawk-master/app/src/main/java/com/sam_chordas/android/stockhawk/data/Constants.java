package com.sam_chordas.android.stockhawk.data;

import android.os.Build;

import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * Created by DELL on 7/11/2016.
 */
public class Constants {
    public static final String KEY_STOCK_SYMBOL = "symbol";
    public static final String KEY_TAB_POSITION = "tab_position";
    public static final String STOCK_SYMBOL_YHOO = "YHOO";
    public static final String STOCK_SYMBOL_AAPL = "AAPL";
    public static final String STOCK_SYMBOL_GOOG = "GOOG";
    public static final String STOCK_SYMBOL_MSFT = "MSFT";
    public static final String KEY_TAG = "tag";
    public static final String VAL_TAG_ADD = "add";
    public static final String VAL_TAG_INIT = "init";
    public static final String VAL_TAG_PEREODIC = "periodic";

    public static final String STOCK_TABLE_CURRENT = "yahoo.finance.quotes";
    public static final String STOCK_TABLE_HISTORY = "yahoo.finance.historicaldata";

    public static final String ACTION_STOCK_UPDATE = "com.example.sam_chordas.stockhawk.STOCK_DATA_UPDATE";

    public static final String DATE_FORMAT_TEMPLATE = "yyyy-MM-dd";
    public static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat(Constants.DATE_FORMAT_TEMPLATE, Locale.ENGLISH);
    public static final int SDK_VERSION = Build.VERSION.SDK_INT;
}
