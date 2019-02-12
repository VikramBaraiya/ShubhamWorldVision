package yadunandan.shubham;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class OwnerProfile extends AppCompatActivity {

    EditText fname,mname,lname,homePhone,mobile,email,address;
    Button add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owner_profile);
        getdata();



    }
    public void getdata()
    {
        fname=(EditText)findViewById(R.id.fName);
        mname=(EditText)findViewById(R.id.mName);
        lname=(EditText)findViewById(R.id.lName);
        homePhone=(EditText)findViewById(R.id.homePhone);
        mobile=(EditText)findViewById(R.id.mobile);
        email=(EditText)findViewById(R.id.Email);
        address=(EditText)findViewById(R.id.Address);
        add=(Button)findViewById(R.id.AddData);
    }


    public void click(){
       // Toast.makeText("this","You have successfully added the record ",Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Record Successfully Added", Toast.LENGTH_SHORT).show();
    }

}
