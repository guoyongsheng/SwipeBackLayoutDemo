package xmen.doshr.com.swipebacklayoutdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import me.imid.swipebacklayout.lib.app.SwipeBackActivity;

public class MainActivity extends SwipeBackActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView()
    {
        setSwipeBackEnable(false);
    }


    public void click(View view)
    {
        Intent intent = new Intent(this, SendActivity.class);
        startActivity(intent);
    }
}
