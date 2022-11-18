package com.example.attemptatautentification.possumLib

import java.io.Serializable
import java.util.ArrayList

class User(name_: String = "new user", var plans: ArrayList<Plan> = ArrayList(), categories_: ArrayList<Category> = ArrayList()) : Serializable {
    var name: String = "new user"
        set(value) {
            if (value.length in 1..9) {
                field = value
            }
        }

    var categories: ArrayList<Category> = ArrayList()
        set(value) {
            field = value

            for(cat : Category in value){
                categoriesNames.add(cat.name)
            }
        }

    var categoriesNames: ArrayList<String> = ArrayList()

    fun addCategory(category: Category) {
        categories.add(category)
        categoriesNames.add(category.name)
    }

    fun deleteCategory(category: Category) {
        categories.remove(category)
        categoriesNames.remove(category.name)
    }

    override fun toString():String{
        return "name "+ name +"\n\ncategories " + categoriesNames.joinToString { el -> "\n"+ el } + "\n\nplans" + plans.joinToString { el->"\n"+el.title }
    }

    init {
        name = name_
        categories = categories_

        categoriesNames.add("без категории")
    }
}