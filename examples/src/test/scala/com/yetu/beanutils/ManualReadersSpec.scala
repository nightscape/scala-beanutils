package com.yetu.beanutils

import com.yetu.beanutils.{ beans ⇒ b }
import com.yetu.beanutils.{ companions ⇒ c }
import org.scalatest.{ MustMatchers, WordSpecLike }

class ManualReadersSpec extends WordSpecLike with MustMatchers {
  "The companion macro, on a JavaBean with manually specified reader methods" when {

    "unapply method" must {
      "extract the values corresponding to the specified reader methods" in {
        val obj = new b.Simple("foo", 42)
        val result = obj match {
          case c.ManualReaders(name) => name
        }

        result === "foo"
      }
    }

  }
}
