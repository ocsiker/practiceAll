


# exercise 3
frais<-c(20.4, 28.4, 48.7, 28.8, 32.9, 85.2, 32.2, 27.8, 27, 36.7, 20.4, 24.3, 24.3, 18, 31.7, 25.7, 41.2, 53, 61, 61.2)
sec<-c(3.6, 3.4, 5.6, 4.1, 3.3, 9.3, 3.7, 3.2, 2.9, 4.5, 2.6, 2.8, 3.1, 2.6, 4.4, 2.8, 4.6, 6, 7.2, 6.3)

df<-data.frame( frais,sec )
modele<-lm(sec ~ frais)
print(df)
# print(modele)
print(coef(modele))
# plot(sec~frais)
# abline(coef(modele),color="blue")
# print(cor.test(modele))
print(summary(modele))
print(predict(modele,data.frame(frais=40),interval = ("prediction")))
