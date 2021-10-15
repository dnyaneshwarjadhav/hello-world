# hello-world

@Bean
	CommandLineRunner init(FolderRepository folderRepo, ReportRepository reportRepo) {
		return args -> {
			List<Folder> folder = null;
			List<Report> reports = null;
			
			
			
			
//			try {
//				folder = folderRepo.findAll();
//				System.out.println(folder.size());
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//			try {
//				reports = reportRepo.findAll();
//				System.out.println(reports.size());
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
		};
	}
