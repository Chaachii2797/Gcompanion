package cabiso.daphny.com.gcompanion;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by Lenovo on 7/24/2017.
 */

public class HomePicture1 extends AppCompatActivity {

    private ImageView img;
    @Override
     protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_picture1);

        img = (ImageView)findViewById(R.id.imageHolder);
//        Bundle extras = getIntent().getExtras();
//        Bitmap bmp = (Bitmap) extras.getParcelable("Bitmap");
//        img.setImageBitmap(bmp);
    }
}
