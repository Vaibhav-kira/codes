library("data.table")
out <- data.table::fread("outcome-of-care-measures.csv")
out[, (17) := lapply(.SD, as.numeric), .SDcols = (17)]
out[, lapply(.SD
             , hist
             , xlab= "Deaths"
             , main = "Hospital 30-Day Death (Mortality) Rates from Pneumonia"
             , col="red")
    , .SDcols = (17)]
