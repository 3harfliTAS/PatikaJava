import random
y =random.random()*10
y = int(y)
sayi  = input("Sayi giriniz")
sayi = int(sayi)
hak = 0
while (hak < 4):
    if y > sayi and sayi >0 :
        print("Aradığın sayı daha büyük")
        hak = hak +1
        sayi  = input()
        sayi = int(sayi)
    elif sayi > y and sayi <100 :
        print("Aradığın sayı daha küçük")
        hak = hak +1
        sayi = input()
        sayi = int(sayi)
    elif sayi > 100 or sayi < 0 :
      print("Aralık dışı değer, Tekrar sayı gir")
      sayi = input()
      sayi = int(sayi)
    elif sayi == y:
        print("Helal dostum")
        break
    elif hak == 2:
        print("şimdi sıçtın işte")
print(y)
