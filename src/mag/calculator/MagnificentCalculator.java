package mag.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MagnificentCalculator extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button btn1=(Button)findViewById(R.id.soyle);
        btn1.setOnClickListener(btnListener);
    }
    private OnClickListener btnListener=new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			 Toast.makeText(getBaseContext(), 
	                    "Hello Magnificent Calculator:", 
	                    Toast.LENGTH_LONG).show();
			
		}
	};
}