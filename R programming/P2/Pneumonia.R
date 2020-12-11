library("data.table")
out <- data.table::fread("outcome-of-care-measures.csv")
out[, (23) := lapply(.SD, as.numeric), .SDcols = (23)]
out[, lapply(.SD
             , hist
             , xlab= "Deaths"
             , main = "Hospital 30-Day Death (Mortality) Rates from heart failure"
             , col="red")
    , .SDcols = (23)]
