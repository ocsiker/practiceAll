setwd("/home/ocsiker/Alpha/sourceCode/R")
tbl <-read.csv("./TD-TP1_EX7.CSV",header=TRUE,";")
save(tbl,file="ex7.rda")
# show number of colums and rows tables  
print(dim(tbl))
print(names(tbl))
print(attach(tbl))
Pays <-tbl[ ,c(2) ]
print(Pays)
print(tbl)
PopulAgri <- tbl[,c(3)]
Calories <- tbl[,c(4)]
print(PopulAgri)
print(Calories)
# performance = a0 + a1* PopulAgri
# print(cor(PopulAgri,Calories))
# print( table)

model <-lm (Calories ~ PopulAgri)
# draw plot
plot(PopulAgri,Calories)
# draw line 
plot(x=c(-25.65509,-8.671975),y=c(3019.29457,3672.949860))
abline(model)
print(coef(model))

print(summary(model))

print( anova(model))

print(confint(model))

