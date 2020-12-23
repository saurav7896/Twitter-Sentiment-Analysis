package lion.lion.com.imagebutton;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);

    }

    public void onImageClick3(View v){
        Intent intent = new Intent(this, Chart.class);
        startActivity(intent);
    }

    public void onImageClick1(View v){
        Intent intent = new Intent(this, Chart.class);
        startActivity(intent);
    }

    public void onImageClick2(View v) {
        Intent intent = new Intent(this, Tweet.class);
        startActivity(intent);
    }

}