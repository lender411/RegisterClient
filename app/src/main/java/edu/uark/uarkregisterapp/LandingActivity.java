package edu.uark.uarkregisterapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import edu.uark.uarkregisterapp.models.transition.ProductTransition;

public class LandingActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_landing);
	}

	public void displayAllEmployeesButtonOnClick(View view) {
		this.startActivity(new Intent(getApplicationContext(), EmployeesListingActivity.class));
	}

	public void createEmployeeButtonOnClick(View view) {
		Intent intent = new Intent(getApplicationContext(), EmployeesViewActivity.class);

		intent.putExtra(
			getString(R.string.intent_extra_product),
			new EmployeeTransition()
		);

		this.startActivity(intent);
	}
}
