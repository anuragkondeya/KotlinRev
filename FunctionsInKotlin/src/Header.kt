class Header(var name: String) {}

fun Header.plusWithoutInfix(other: Header): Header {
    return Header(this.name + other.name)
}
/*
Infix functions
Member of extension fuction
Function with single param
marked with infix
 */

infix operator fun Header.plus(other: Header): Header {   //Operator modifier is required for operator overloading only
    return Header(this.name + other.name)
}