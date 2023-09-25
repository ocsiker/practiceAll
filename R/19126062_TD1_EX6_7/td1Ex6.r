setwd("/home/ocsiker/Alpha/sourceCode/R")
tble <-read.csv("./TD-TP1_EX6.CSV",header=TRUE,";")
save(tble,file="ex6.rda")
# print(is.data.frame(tble))
print(dim(tble))
# class(tble)
# print(tble,nom)
print(names(tble))
print(attach(tble))
Nom <-tble[ ,c(2) ]
print(Nom)
print(tble)
Taille <- tble[,c(3)]
Performance <- tble[,c(4)]
print(Taille)
print(Performance)
# performance = a0 + a1* Taille
# print(cor(Taille,Performance))
# print( table)

model <-lm (Performance ~ Taille)

print(coef(model))

print(summary(model))

print( anova(model))
