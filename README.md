Create Spring MVC Recipe Project
================================
  . Create with spring initializr
  
      Select dependencies : Web, Thymeleaf, DevTools, JPA, H2
  . Create index.html
  
  . HTTP -Hypertext Transfer Protocol
        
        - GET,POST,PUT,TRACE,OPTIONS,DELETE,CONNECT,PATCH
        - Safe Methods are GET,HEAD,OPTIONS, TRACE
        - Idempotent Methods are - PUT,DELETE and Safe Methods
        
   . One to One Mapping
        
        -@Entity
        -@Id
        -@GeneratedValue(strategy = GenerationType.IDENTITY)
        -@Lob
        -@OneToOne(cascade = CascadeType.ALL)
       
        
        -@Entity
        -@Id
        -@GeneratedValue(strategy = GenerationType.IDENTITY)
        -@Lob
        -@OneToOne
        
  .One to Many Mapping
  
        -@Entity
        -@Id
        -@GeneratedValue(strategy = GenerationType.IDENTITY)
        -@OneToMany(cascade = CascadeType.ALL,mappedBy = "recipe")
        
        -@Entity
        -@Id
        -@GeneratedValue(strategy = GenerationType.IDENTITY)
        -@ManyToOne
        
  . Sub class One to One Mapping
  
        -@Entity
        -@Id
        -@GeneratedValue(strategy = GenerationType.IDENTITY)
        -@OneToOne(fetch = FetchType.EAGER)
        
        -@Entity
        -@Id
        -@GeneratedValue(strategy = GenerationType.IDENTITY)
        
  . JPA Enumerations
        
        - @Enumerated(value = EnumType.STRING)
          Difficulty difficulty;
          
        - Create enum 
 
