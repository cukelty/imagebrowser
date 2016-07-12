package tianyuan.imagebrowser;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by litianyuan on 16/7/12.
 */
public class MainActivity extends Activity {
        Context mcontext;
    String[] urls={"http://pic13.nipic.com/20110415/1369025_121513630398_2.jpg",
                    "http://img4.mypsd.com.cn/20110711/Mypsd_59719_201107111448020001B.jpg",
                    "http://pic13.nipic.com/20110415/1369025_121513630398_2.jpg"};
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mcontext=this;


        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mcontext,ImagePagerActivity.class);
                //图片URL
                intent.putExtra(ImagePagerActivity.EXTRA_IMAGE_URLS,urls);
                intent.putExtra(ImagePagerActivity.EXTRA_IMAGE_INDEX,0);
                startActivity(intent);

            }
        });

    }
}
