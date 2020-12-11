library("data.table")
out <- data.table::fread("outcome-of-care-measures.csv")
out[, (11) := lapply(.SD, as.numeric), .SDcols = (11)]
out[, lapply(.SD
                 , hist
                 , xlab= "Deaths"
                 , main = "Hospital 30-Day Death (Mortality) Rates from Heart Attack"
                 , col="red")
        , .SDcols = (11)]
