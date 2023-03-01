package com.example.SpringBoot_Lezione2;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BoxTest.class, PersonaTest.class, BoxTestParameterized.class })
public class AllTests {

}
