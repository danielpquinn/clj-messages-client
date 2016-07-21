(ns messages.components.signup
  (:require [reagent.core :as reagent]))

;; Handle form submission

(defn handle-submit [e username email password password-confirm]
  (.log js/console @username @email @password @password-confirm)
  (.preventDefault e))

;; Handle input changes

(defn handle-input-change [e atom]
  (swap! atom (get-in e (.-value (.-target e)))))

;; String atom input component

(defn atom-input [type name atom]
  [:input {:type type :name name :value @atom :on-change #(reset! atom (-> % .-target .-value))}])

;; Signup component

(defn signup []
  (let [username (reagent/atom "")
        email (reagent/atom "")
        password (reagent/atom "")
        password-confirm (reagent/atom "")]
    (fn []
      [:div {:class-name "signup"}
        [:form {:on-submit #(handle-submit % username email password password-confirm)}
          (atom-input "text" "username" username)
          (atom-input "text" "email" email)
          (atom-input "password" "password" password)
          (atom-input "password" "password-confirm" password-confirm)
          [:button {:type "submit"} "Sign up"]]])))
