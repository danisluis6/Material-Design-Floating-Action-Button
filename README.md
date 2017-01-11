# MATERIAL DESIGN FLOATING ACTION BUTTON [![Build Status](https://travis-ci.org/nomensa/jquery.hide-show.svg)](https://travis-ci.org/nomensa/jquery.hide-show.svg?branch=master)

##Version1

    - Reset position of Float Action Button. So We need to move to it to anywhere what I like.
	<android.support.design.widget.FloatingActionButton
		android:id="@+id/fab"
		app:fabSize="normal"
		app:backgroundTint="@color/backgroundTintColor"
		android:layout_height="wrap_content"
		android:layout_width="wrap_content"
		android:src="@drawable/ic_mail"
		android:layout_margin="@dimen/fab_margin"/>

    - Let's start to custom position of FloatActionButton: You only need to two statements below:
        app:layout_anchor="@id/listToDo"
        app:layout_anchorGravity="bottom|center|end"

    - DIFFICULT LEVEL 1: Create Behavior for FloatActionButton
    + FloatActionButton - Button
    + app:layout_behavior="" - onClick=""
    => Create file Java and insert into it.
    => PROBLEM WITH YOU: I CANN'T SEE ANY ANIMATION AROUND SCROLLING LISTVIEW.



<p align="center">
  <img src="https://github.com/danisluis6/Mock-up-Dictionary/blob/version1/1.png">
</p>

