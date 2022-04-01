package com.example.todoapp

sealed class NavRoute(val route:String){
    object Home:NavRoute("home_route")
    object Detail:NavRoute("detail_route")
}
