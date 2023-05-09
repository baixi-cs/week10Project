package com.example.mockiOn;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;

import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)                         
class ServiceTest {

    @Mock
    Database databaseMock;     //clone project or mock  
    
//    @Ignore
    @Test
    public void testQuery()  {
        assertNotNull(databaseMock);
        when(databaseMock.isAvailable()).thenReturn(true);  
//        when(databaseMock.getUniqueId()).thenCallRealMethod();
//        assertEquals(42, databaseMock.getUniqueId());
        Service t  = new Service(databaseMock);             
        boolean check = t.query("* from t");  
        System.out.println("here............................."+ t);
        assertTrue(check);
//        assertEquals(check, true);
//           
    }
    
    @BeforeAll
    public static void beforerMethod() {
  	  System.out.println("before method.............................");
    }
      
    @AfterAll
    public static void afterMethod() {
  	  System.out.println("after method.............................");
    }
    
      
      
      
}
