(ns user

  "For daydreaming in the REPL." 

  (:require [clojure.repl]
            [clojure.test                :as t]
            [cognitect.transit           :as transit]
            [criterium.core              :as C]
            [dvlopt.dsim                 :as dsim]
            [dvlopt.dsim.ranktree        :as dsim.ranktree]
            [dvlopt.dsim.util            :as dsim.util]
            [dvlopt.dsim-test            :as dsim-test]
            [dvlopt.dsim.util-test       :as dsim.util-test]
            [dvlopt.fdat                 :as fdat :refer [?]]
            [dvlopt.fdat.track           :as fdat.track]
            [dvlopt.fdat.plugins.nippy   :as fdat.plugins.nippy]
            [dvlopt.fdat.plugins.transit :as fdat.plugins.transit]
            [dvlopt.void                 :as void]
            [kixi.stats.core             :as K.S]
            [kixi.stats.distribution     :as K.D]
            [taoensso.nippy              :as nippy]))




;;;;;;;;;;


(comment

  )