package org.example

// Write two classes Item and ShoppingCart (in their separate files) so the following code works:
//
//val item = Item("Mars", 4.99)
//
//item.name // 'Mars'
//item.price // 4.99
//
//val cart = ShoppingCart()
//cart.getTotalPrice() // 0.0
//
//cart.addItem(item)
//
//cart.getTotalPrice() // 4.99
//
//cart.addItem(Item("Skittle", 3.99))
//cart.addItem(Item("Skittle", 3.99))
//
//cart.getTotalPrice() // 12.97

data class Item (
    val name: String,
    val price: Double
)
